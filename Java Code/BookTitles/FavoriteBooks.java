

/**
 *
 * @author chris
 */
class FavoriteBooks {
    private String title;
    private String author_last;
    private String author_first;
    private int copyright;
    
        
        public void setTitle(String title){
            this.title = title;
        }
        public String getTitle(){
            return title;
        }
        public void setAuthor_Last(String author_last){
            this.author_last = author_last;
        }
        public String getAuthor_Last(){
            return author_last;
        }
        public void setAuthor_First(String author_first){
            this.author_first = author_first;
        }
        public String getAuthor_First(){
            return author_first;
        }
        public void setCopyright(int copyright){
            this.copyright = copyright;
        }
        public int getCopyright(){
            return copyright;
        }
   
}