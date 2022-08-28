package Model;

public class Text extends MessageModel {
  private String text;

  public Text() {

  }

  public Text(String text) {
    super(text);
    this.text = super.text;
  }

  @Override
  public String toString() {
    return text;
  }
}