def getPi(digits=2000):
    from urllib.request import urlopen
    url = 'https://vhernando.github.io/pi-digits-500000-calculate'
    page = urlopen(url)
    html_bytes = page.read()
    html = html_bytes.decode("utf-8")
    
    sp = html.find('3.14')   # starting point of pi
    
    # ending point of pi
    #ep = html.find('24<br>')
    
    return html[sp:sp+digits]

def compare(approx_pi, digits=2000):
    org_pi = getPi(digits)
    approx_pi = str(approx_pi)
    count=0
    i=0
    try:
        while(i<=digits):
            if org_pi[i] != approx_pi[i]:
                break
            count+=1
            i+=1
    except:
        print('Error at: ',i)
    return count