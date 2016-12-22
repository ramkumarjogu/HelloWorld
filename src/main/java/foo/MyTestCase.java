package foo;

import static org.assertj.core.api.Assertions.assertThat;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Optional;

import org.junit.Test;
public class MyTestCase {

/* To check what the optional contains some value and what that containing value is*/
	 @Test
	    public void mytest(){
	    	Optional<String> givenOptional = Optional.of("ramkumar");
	    	assertThat(givenOptional)
	    	  .isPresent()
	    	  .hasValue("ramkumar");
	    }
	 //check if a given date is before/after a given date, or today:
	 @Test
	 public void mytestt(){
		 LocalDate givenLocalDate = LocalDate.of(2016, 7, 8);
		 LocalDate todayDate = LocalDate.now();
		 assertThat(givenLocalDate)
		  .isBefore(LocalDate.of(2020, 7, 8))
		  .isAfterOrEqualTo(LocalDate.of(1989, 7, 8));
		 
		assertThat(todayDate)
		  .isAfter(LocalDate.of(1989, 7, 8))
		  .isToday();
		 
	 }
	 @Test
	 public void mytest2(){
		 LocalDateTime givenLocalDate = LocalDateTime.of(2016, 7, 8, 12, 0);
		 assertThat(givenLocalDate)
		  .isBefore(LocalDateTime.of(2020, 7, 8, 11, 2));
		 
	 }
	 @Test
	 public void mytest3(){
		 LocalTime givenLocalTime = LocalTime.of(12, 15);
		 assertThat(givenLocalTime)
		  .isAfter(LocalTime.of(1, 0))
		  .hasSameHourAs(LocalTime.of(12, 0));
	 }
	 
	 
	 
	 
	 

}
