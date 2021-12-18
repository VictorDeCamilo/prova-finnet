package Pages;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MetodosDeTeste extends Browser {

	public void clicar(By elemento) {

		try {
			driver.findElement(elemento).click();
		} catch (Exception e) {
			System.err.println("-------- erro ao clicar -------" + e.getMessage());
			System.err.println("-------- causa do erro --------" + e.getCause());
		}

	}

	public void escrever(By elemento, String texto) {

		try {
			driver.findElement(elemento).sendKeys(texto);
		} catch (Exception e) {
			System.err.println("-------- erro ao escrever -------" + e.getMessage());
			System.err.println("-------- causa do erro --------" + e.getCause());
		}
	}

	public void pausa(int tempo) {

		try {
			Thread.sleep(tempo);
		} catch (Exception e) {
			System.err.println("-------- erro ao pausar com Thread.sleep -------" + e.getMessage());
			System.err.println("-------- causa do erro --------" + e.getCause());
		}
	}

	public void screenShot(String nomeEvidencia) {

		try {
			TakesScreenshot scrShot = (TakesScreenshot) driver;
			File scrFile = scrShot.getScreenshotAs(OutputType.FILE);
			File destFile = new File("./Evidencias/" + nomeEvidencia + ".png");
			FileUtils.copyFile(scrFile, destFile);

		} catch (Exception e) {
			System.err.println("-------- erro ao tirar screenshot -------" + e.getMessage());
			System.err.println("-------- causa do erro --------" + e.getCause());
		}

	}

	public void esperarElementoClicavel(By elemento, int tempo) {

		try {
			WebDriverWait wait = new WebDriverWait(driver, tempo);
			wait.until(ExpectedConditions.elementToBeClickable(elemento));
		} catch (Exception e) {
			System.err.println("-------- erro ao esperar elemento clicável -------" + e.getMessage());
			System.err.println("-------- causa do erro --------" + e.getCause());
		}

	}
}
