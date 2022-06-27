package com.leannode.test;

import com.leannode.enums.*;
import com.leannode.models.PhoneNumber;
import com.leannode.models.TesterApplicationForm;
import org.junit.jupiter.api.Test;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class LeanNodeTests extends LeanNodeWebBaseTest {
    @Test
    public void TC_01_SubmitTestersApplicationTest() {
        page.homePage().goToJoinUsTesters();
        page.joinUsTestCommunityPage().PopulateTestCommunityForm(new TesterApplicationForm()
                .name("Khaled Attia")
                .email("Khaled.Attia@getnada.com")
                .phoneNumber(new PhoneNumber("Saudi Arabia", "000000000"))
                .gender(Gender.Male)
                .birthDay(new GregorianCalendar(1991, Calendar.MARCH, 9).getTime())
                .country("Saudi Arabia")
                .city("Jeddah")
                .language("Arabic")
                .levelOfEducation(LevelOfEducation.Diploma)
                .educationMajor(EducationMajor.IT)
                .hobbies(Hobbies.Gaming)
                .techLevel(TechLevel.Advance)
                .mobileOS(MobileOS.iOS)
                .job(Job.FullTime)
                .playingGames(true)
                .gameGenres(GameGenres.Adventure)
                .gamingFrequency(GamingFrequency.PlusEightHours)
                .build());
        page.joinUsTestCommunityPage().clickSubmit();
        page.joinUsTestCommunityPage().verifySuccessfulApplication();

    }
}
