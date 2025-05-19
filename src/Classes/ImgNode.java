package Classes;

public class ImgNode extends HtmlElementNode{
    String IMG_Open, IMG_Close;

    public ImgNode(int line, int column) {
        super(line, column);
    }

    public String getIMG_Open() {
        return IMG_Open;
    }

    public void setIMG_Open(String IMG_Open) {
        this.IMG_Open = IMG_Open;
    }

    public String getIMG_Close() {
        return IMG_Close;
    }

    public void setIMG_Close(String IMG_Close) {
        this.IMG_Close = IMG_Close;
    }

    @Override
    public String toString() {
        return "ImgNode{" +
                "IMG_Open='" + IMG_Open + '\'' +
                ", IMG_Close='" + IMG_Close + '\'' +
                '}';
    }
}
