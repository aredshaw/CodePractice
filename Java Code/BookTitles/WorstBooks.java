
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
