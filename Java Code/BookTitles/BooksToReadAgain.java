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
public class BooksToReadAgain {
        public static void wanttoreadagain(){
        FavoriteBooks reread = new FavoriteBooks();
        reread.setTitle("Mistborn");
        reread.setAuthor_Last("Sanderson");
        reread.setAuthor_First("Brandon");
        reread.setCopyright(2014);
        String again = "A book I would like to read again is ";
        String c = "Copyright ";
        System.out.println(again + reread.getTitle() + ".");
        System.out.println("By " + reread.getAuthor_First() + " " + reread.getAuthor_Last());
        System.out.println(c + reread.getCopyright() + ".\n");

    }
}
