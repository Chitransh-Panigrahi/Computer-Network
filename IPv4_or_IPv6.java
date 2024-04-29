import java.net.*;

public class IPv4_or_IPv6 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        InetAddress address;

        try {
            address = InetAddress.getByName("www.google.com");
            int version = getVersion(address);

            if (version == 4) {
                System.out.println("IPv4 Address");
            } else if (version == 6) {
                System.out.println("IPv6 Address");
            } else {
                System.out.println("Unknown Address");
            }
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }

    public static int getVersion(InetAddress ia) {
        byte[] address = ia.getAddress();
        if (address.length == 4)
            return 4;
        else if (address.length == 6)
            return 6;
        else
            return -1;
    }
}

