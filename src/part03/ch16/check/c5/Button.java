package part03.ch16.check.c5;

public class Button {
    @FunctionalInterface
    public static interface ClickListener {
         void click();
    }

    private ClickListener clickListener;

    public void setClickListener(ClickListener clickListener) {
        this.clickListener = clickListener;
    }
    public void click(){
        this.clickListener.click();
    }
}
