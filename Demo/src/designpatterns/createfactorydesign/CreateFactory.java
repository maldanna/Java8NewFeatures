package designpatterns.createfactorydesign;
// create factory will be useful when one interface and diff implementation classes 
public class CreateFactory {
    
    public Os createObjectOs(String osName){
        switch(osName){
            case "Ios":
            { return new Ios();}
            case "Windows":
            { return new Windows();}
            case "Android":
            {return new Android();}
            default:
            {return null;}

        }
    }
}
