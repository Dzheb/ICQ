package Model;

public class Video extends MessageModel {
  // private String text;

  public Video(String string) {
    super(string);
    super.text = "Воспроизводится видео: - " + super.text;
  }

}