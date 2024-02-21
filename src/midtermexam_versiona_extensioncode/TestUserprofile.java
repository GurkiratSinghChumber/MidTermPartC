/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexam_versiona_extensioncode;

import java.util.Scanner;

/**
 *
 * @author gur28
 */
public class TestUserprofile {
       public static void main(String args[]){
       Scanner scanner = new Scanner(System.in);


        System.out.print("Enter your name: ");
        String userName = scanner.nextLine();


        UserProfile demoUser = new UserProfile();
        String[] genreList = demoUser.getGenreList();
        
        System.out.println("Choose your favorite genre: ");
        for(int i = 0; i< genreList.length;i++){
            System.out.println((i+1)+" : "+genreList[i]);
        }
        
        
        int genreNumber = scanner.nextInt();
        
        String chosenGenre = genreList[genreNumber-1];

        UserProfile userProfile = new UserProfile(userName, chosenGenre);


        System.out.println("User profile created!");
        System.out.println("Name: " + userProfile.getUserID());
        System.out.println("Favorite Genre: " + userProfile.getGenre());
       }
}
