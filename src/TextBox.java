public class TextBox extends UIControl {
    private String text ="";
    protected boolean isEnabled = true;

    @Override
    public String toString(){
        return text;
    }

//    public TextBox() {
//        super(true);
//        this.isEnabled = isEnabled;
//        System.out.println("textbox");
//    }

    @Override
    public void render() {
        System.out.println("render textbox");
    }

    public void setText(String text){
        this.text = text;
    }
    public  void clear(){
        text = "";
    }
}
