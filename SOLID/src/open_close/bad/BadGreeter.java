package open_close.bad;

public class BadGreeter {
    private String formality;
    public void setFormality(String formality){
        this.formality = formality;
    }
    public String greet(){
        if (formality == "formal"){
            return "Good evening, sir.";
        }
        else if (formality == "casual"){
            return "Whatsapp bro?";
        }
        else if (formality == "intimate"){
            return "Hello Darling!";
        }
        else if (formality == "bestfriend"){
            return "Salem!";
        }
        else{
            return "hello.";
        }
    }
}