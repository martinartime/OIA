package comandoDeRobot;

import java.io.IOException;

import org.junit.Test;

import org.junit.Assert;

public class ComandoDeRobotTest {

	@Test
	public void prueba1() throws IOException{
		String in="C:\\Users\\Pablo\\Workspace\\OIAMIOS\\src\\comandoDeRobot\\In\\prueba1.in";
		String out="C:\\Users\\Pablo\\Workspace\\OIAMIOS\\src\\comandoDeRobot\\Out\\prueba1.out";;
		Robot robot= new Robot(in);
		robot.mover();
		robot.aArchivo(out);
		Assert.assertEquals(5,robot.getFila());
		Assert.assertEquals(1,robot.getColumna());
		
	}
	
	@Test
	public void guia() throws IOException{
		String in="C:\\Users\\Pablo\\Workspace\\OIAMIOS\\src\\comandoDeRobot\\In\\guia.in";
		String out="C:\\Users\\Pablo\\Workspace\\OIAMIOS\\src\\comandoDeRobot\\Out\\guia.out";;
		Robot robot= new Robot(in);
		robot.mover();
		robot.aArchivo(out);
		Assert.assertEquals(10,robot.getFila());
		Assert.assertEquals(3,robot.getColumna());
		
	}
	@Test
	public void extremo() throws IOException{
		String in="C:\\Users\\Pablo\\Workspace\\OIAMIOS\\src\\comandoDeRobot\\In\\extremo.in";
		String out="C:\\Users\\Pablo\\Workspace\\OIAMIOS\\src\\comandoDeRobot\\Out\\extremo.out";;
		Robot robot= new Robot(in);
		robot.mover();
		robot.aArchivo(out);
		Assert.assertEquals(2,robot.getFila());
		Assert.assertEquals(2,robot.getColumna());
		
	}
}
