package moodanalysertest;

public class MoodAnalyser {
    private String message;

    MoodAnalyser(String message){
        this.message=message;
    }
    public String analyseMood() {
        try {
            if (message.contains("sad")) {
                return "SAD";
            }
            if (message.contains("any")) {
                return "HAPPY";
            }
            return "FINE";
        }catch (NullPointerException e){
            return "HAPPY";
        }
    }
}
