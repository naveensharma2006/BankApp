package na20100995.foundation.bank.na20100995_bank.controller;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@WebMvcTest(AccountController.class)
@TestMethodOrder(OrderAnnotation.class)
class AccountControllerTest {

	@Test
	@Order(1)
	void test() {
		fail("Not yet implemented");
	}

}
