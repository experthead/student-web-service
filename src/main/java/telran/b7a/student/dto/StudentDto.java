package telran.b7a.student.dto;

import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Builder
public class StudentDto {
	Integer id; // Null if do not was filled
	String name;
	Map<String, Integer> scores;
}
