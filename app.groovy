@RestController
@EnableAutoConfiguration
class ThisWillActuallyRun {

    @RequestMapping("/")
    String home() {
        "Hello World!"
    }

    @RequestMapping("/test")
    String testPage() {
        "This is a test page!!!!"
    }
}