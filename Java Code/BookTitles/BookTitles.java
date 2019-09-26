/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package booktitles;

/**
 *
 * @author Aaron Redshaw
 */
class BookTitles {
public static void main(String[] args){

FavoriteBooks book1 = new FavoriteBooks();
//BookTitles want = new BookTitles();
//want.setTitle("The Three Body Problem");
//System.out.println("A book I would like to get is " + want.getTitle());


book1.setTitle("The Name of the Wind");
book1.setAuthor_Last("Rothfuss");
book1.setAuthor_First("Patrick");
book1.setCopyright(2008);

System.out.println("One of my favorite books is " + book1.getTitle() + " \nby " + book1.getAuthor_First() + " " + book1.getAuthor_Last() + "\nPublished in " + book1.getCopyright() + ".\n");
BooksToRead.wanttoread();

BooksToReadAgain.wanttoreadagain();
WorstBooks.notgood();

    }
}
