

public class Author extends Publisher{
    int authorId;
    String authorName;
    String email;

    void setAuthorId(int authorId){
        this.authorId=authorId;
    }
    void setAuthorName(String authorName){
        this.authorName=authorName;
    }
    void setEmail(String email){
        this.email=email;
    }
    int getAuthorId(){
        return authorId;
    }
    String getAuthorName(){
        return authorName;
    }
    String getEmail(){
        return email;
    }
}
