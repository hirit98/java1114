package Day08;

import java.net.InetAddress;

public class InetAddress_ {
    public static void main(String[] args) {

        // IP 주소 얻기 : java.net
        try{
            InetAddress local = InetAddress.getLocalHost();
            System.out.println("현재 PC의 IP 주소 : "+local);
            System.out.println("현재 PC의 이름 : "+local.getHostName());

            InetAddress[] iaArr = InetAddress.getAllByName("www.naver.com");
            for(InetAddress remote:iaArr){
                System.out.println("www.naver.com IP 주소 "+remote.getHostAddress());
            }

        }catch (Exception e){
            System.out.println("Error : "+e.getMessage());
        }
    }
}
