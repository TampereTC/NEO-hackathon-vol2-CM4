# -*- coding: utf-8 -*-
import requests
import time


def main():
    url = 'http://localhost:3000'
    num_requests = 1000
    start_time = time.time()
    
    for i in range(num_requests):
        print i + 1
        r = requests.get(url)
        if r.status_code != 200:
            print 'ERROR: Received HTTP code: {0}'.format(r.status_code)
            print r.text
            break
    
    end_time = time.time()
    duration = end_time - start_time
    print 'Duration: {0} sec'.format(duration)
    print 'Requests / sec: {0}'.format(num_requests / duration)


if __name__ == '__main__':
    main()
