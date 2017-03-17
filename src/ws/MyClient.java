package ws;

public class MyClient {
	 
  public static void main(String[] args) {
     HelloWebServiceService hwss = new HelloWebServiceService();
 
     HelloWebService hws = hwss.getHelloWebServicePort();
 
     String result = hws.helloWord2("han") + "\r\n" + hws.helloWord2("hanxuemin");
     
     System.out.println(result);
  }
 
}
