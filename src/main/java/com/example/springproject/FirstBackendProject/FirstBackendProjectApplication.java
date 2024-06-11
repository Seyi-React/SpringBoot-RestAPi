package com.example.springproject.FirstBackendProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;



@SpringBootApplication
public class FirstBackendProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(FirstBackendProjectApplication.class, args);
    }

    @RestController
    class HomeController {
        @GetMapping("/")
        public String home() {
            return "Welcome to the Home Page!";
        }
    }

    @RestController
    class HelloController {
        @GetMapping("/hello")
        public String hello() {
            return "Hello, World!";
        }
    }

    @RestController
    class SeyiController {
        @GetMapping("/seyi")
        public String show() {
            return "seyi";
        }
    }

    @RestController
    class GreetingController {
        @GetMapping("/greet")
        public String greet(@RequestParam(value = "name", defaultValue = "Guest") String name) {
            return "Hello, " + name + "!";
        }
    }

    @RestController
    class FarewellController {
        @GetMapping("/farewell")
        public String farewell() {
            return "Goodbye!";
        }
    }

    @RestController
    class InfoController {
        @GetMapping("/info/{id}")
        public String info(@PathVariable("id") int id) {
            return "Information for ID: " + id;
        }
    }

	@RestController
    class testController {
        @GetMapping("/test")
        public String test() {
            return "on test";
        }
    }


	@RestController
	class submit {
		@PostMapping("/submit")
		public String submitMe () {
			return "form submitted";
		}
		
	}

    @RestController
    class JsonController {
        @GetMapping("/json")
        public Message json() {
            return new Message("This is a JSON response", 123);
        }

        class Message {
            private String content;
            private int id;

            public Message(String content, int id) {
                this.content = content;
                this.id = id;
            }

            public String getContent() {
                return content;
            }

            public int getId() {
                return id;
            }

            public void setContent(String content) {
                this.content = content;
            }

            public void setId(int id) {
                this.id = id;
            }
        }
    }
}
