import getpass
import json
import os
import requests

print('The Huxley Toolkit')

s = requests.session()
data = {
    "username": raw_input("The Huxley username: "),
    "password": getpass.getpass("The Huxley password: "),
    "grant_type": "password",
    "scope": "read",
    "client_id": "ui",
    "Name": None
}
headers = {
    "Authorization": "Basic dWk6"
}
headers = {
    "Authorization": "Bearer %s" % json.loads(s.post('https://www.thehuxley.com/auth/oauth/token', headers=headers, data=data).content)['access_token']
}

while True:
    print
    print('1 - Get problems of list')
    print('2 - Get source code')
    print('3 - Get input and output of problem')
    print('0 - Exit')
    i = input('Select an option above: ')
    print

    if i == 0:
        break

    elif i == 1:
        list_id = input('The Huxley list id: ')
        r = s.get('https://www.thehuxley.com/api/v1/user/quizzes/%s/problems?max=100&offset=0' % list_id, headers=headers)
        j = json.loads(r.content)

        print
        print('List %s' % list_id)
        for e in j:
            print('https://www.thehuxley.com/problem/%s' % e['id'])

    elif i == 2:
        submission_id = input('The Huxley submission id: ')
        r = s.get('https://www.thehuxley.com/api/v1/submissions/%s/sourcecode' % submission_id, headers=headers)

        sourcecode_path = os.path.join(os.path.expanduser('~'), 'Desktop', '%s-sourcecode.txt' % submission_id)
        f = open(sourcecode_path, 'wb')
        f.write(r.content)
        f.close()

        print
        print('Source code saved at %s' % sourcecode_path)

    elif i == 3:
        problem_id = input('The Huxley problem id: ')
        testcase_id = input('The Huxley test case id: ')
        r = s.get('https://www.thehuxley.com/api/v1/problems/%s/testcases/%s' % (problem_id, testcase_id), headers=headers)
        j = json.loads(r.content)

        input_path = os.path.join(os.path.expanduser('~'), 'Desktop', '%s-%s-input.txt' % (problem_id, testcase_id))
        f = open(input_path, 'wb')
        f.write(j['input'])
        f.close()

        output_path = os.path.join(os.path.expanduser('~'), 'Desktop', '%s-%s-output.txt' % (problem_id, testcase_id))
        f = open(output_path, 'wb')
        f.write(j['output'])
        f.close()

        print
        print('Input saved at %s' % input_path)
        print('Output saved at %s' % output_path)

    else:
        print('Invalid option!')
