package day10;

import java.util.Scanner;

public class HttpCodes {
    public static void main(String[] args) {
        /*
        7.  HTTP is the protocol that governs communications between web-servers and web clients.
        Part of the protocol includes a status code returned by the server to tell the browser
        the status of its most recent page request.
    Some of the codes and their meanings are listed below:
            status codes and their meanings:
	                200, OK       201, Created         202, Accepted        301, Moved Permanently
	                303, See Other       304, Not Modified          307, Temporary Redirect
	                400, Bad Request          401, Unauthorized          403, Forbidden
	                404, Not Found     410, Gone      500, Internal Server Error   503, Service Unavailable
         declare an int variable called statusCode, and a valid status code is already given
         write a program that prints out, on a line by itself,
         the appropriate label from the above list based on status.
                    Example:
                        if status code = 200
                    output:
                        ok
            NOTE: MUST USE TERNARY.
         */
        Scanner scanner=new Scanner(System.in);
        System.out.print("Please enter status code: ");
        int code= scanner.nextInt();

        String meaning=(code==200||code==201||code==202||code==301||code==303||code==304||code==307||code==400||code==401
        ||code==403||code==404||code==410||code==500)?// checked whether the code is one of the given ones(nested if)
        (code==200)?"OK":(code==201)?"Created":(code==202)?"Accepted":(code==301)?"Moved Permanently"
                :(code==303)?"See Other":(code==304)?"Not Modified":(code==307)?"Temporary Redirect":(code==400)?"Bad Request"
                :(code==401)?"Unauthorized":(code==403)?"Forbidden":(code==404)?"Not Found":(code==410)?"Gone"
                :(code==500)?"Internal Server Error":"Service Unavailable":"Invalid status code";
        System.out.println(meaning);
    }
}
