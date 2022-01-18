package moodanalysertest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyserTest {


    @Test
    public void givenMessage_WhenProper_ReturnSad(){
        MoodAnalyser moodAnalyser=new MoodAnalyser("User is sad");
        String actualResult=moodAnalyser.analyseMood();
        Assertions.assertEquals("SAD",actualResult);
    }
    @Test
    public void givenMessage_ContainsAny_ReturnHappy(){
        MoodAnalyser moodAnalyser=new MoodAnalyser("Do any work");
        String actualResult=moodAnalyser.analyseMood();
        Assertions.assertEquals("HAPPY",actualResult);
    }
    @Test
    public void givenMessage_Null_ShouldReturnHappy(){
        MoodAnalyser moodAnalyser=new MoodAnalyser(null);
        String actualResult=moodAnalyser.analyseMood();
        Assertions.assertEquals("HAPPY",actualResult);
    }
}
