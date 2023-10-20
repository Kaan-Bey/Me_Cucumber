package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/cucumber-reports1.html",
                "json:target/json-reports/cucumber1.json",
                "junit:target/xml-report/cucumber1.xml"},
        features = "src/test/resources/features",
        glue = "stepdefinitions",
        tags = "@web",
        dryRun = false
)
public class ParelelRunner1 {

    /*
        Runner class'i bos bir class'dir

        bu class'da asil isi

        Class'da kullandigimiz 2 notasyon yapar

        dryRun = true secildiginde
        Runner istenen featur/scenario'yu calistirmaya degil
        eksik adimlarini bulmaya odaklanir

        eger eksik adim yoksa
        test PASSED der.
        ama bu testin calisip, tum adimlarin gectigini gostermez
        SADECE eksik adim olmadigini gosterir

        EGER eksik adim bulma amacimiz yoksa
        testlerimizi normal olarak CALISTIRMAK istiyorsak
        dryRun = false secilmelidir
     */

}
