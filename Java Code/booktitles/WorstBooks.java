/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package booktitles;

/**
 *
 * @author chris
 */
public class WorstBooks {
    public static void notgood(){
        FavoriteBooks bad = new FavoriteBooks();
        bad.setTitle("Accelerando");
        bad.setAuthor_Last("Stross");
        bad.setAuthor_First("Charles");
        bad.setCopyright(2006);
        System.out.println("I recommend you avoid " + bad.getTitle() + "\n" + "By " + bad.getAuthor_First() + " " + bad.getAuthor_Last() + "\n" + "Copyright " + bad.getCopyright());
    }
    
}
