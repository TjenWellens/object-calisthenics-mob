package uk.socrates.objectcalisthenics.adventofcode;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class ExampleTests {
	@Disabled
	@Test
	void part1_input() throws IOException {
		final Path path = Paths.get("src", "test", "resources", "input.txt");
		final List<String> lines = Files.readAllLines(path);
		assertThat(true).isFalse();
	}

	@Nested
	@DisplayName("better name for nested part")
	class A_Nested_test_case {
		@Test
		void a_test() {
			assertThat(true).isFalse();
		}
	}

}
