

/**
 *
 * @author Aaron Redshaw
 */
class BooksToRead {
    public static void wanttoread(){
        FavoriteBooks want = new FavoriteBooks();
        want.setTitle("The Three Body Problem");
        want.setAuthor_Last("Liu");
        want.setAuthor_First("Cixin");
        want.setCopyright(2016);
        System.out.println("A book I would like to get is " + want.getTitle());
        System.out.println("By " + want.getAuthor_First() + " " + want.getAuthor_Last());
        System.out.println("Copyright" + want.getCopyright() + "\n");

    }
}
