

/**
 * This program checks the SCTP availability on your system
 * 1.Ubuntu: sudo apt-get install lksctp-tools
 * 2.I you get Access restriction error on com.sun.nio ,
 * then remove jre from build path, and add again.
 * 
 * To ensure that you have a correctly configured machine and JDK, try compiling and running the following application.
 * If it compiles and runs without any errors, then congratulations you have a correctly configured machine and JDK. You can now start writing applications that use the SCTP API.
 * 
 * @author Anupam Gangotia
 * Profile::http://en.gravatar.com/gangotia
 * github::https://github.com/agangotia
 *
 */
public class TestSCTP {

	/**
	 * @param args
	 */
	 public static void main(String[] args) throws Exception {
         com.sun.nio.sctp.SctpChannel sc = com.sun.nio.sctp.SctpChannel.open();
     }

}
