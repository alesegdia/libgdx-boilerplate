package com.ufofrog.core;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Screen;

/**
 * @author Alejandro Segu� D�az
 */

// generics para acceder a las demás screens
// en nuestra clase game propia desde las heredadas
public abstract class GameScreen<GameClass extends Game> implements Screen {
	
	final protected GameClass game;
	

	public GameScreen(GameClass game) {

		this.game = game;
		// set camera en Input en vez de pasar la camara en el update
		
	}
	
	// codigo al reiniciar un screen
	public void Reset()
	{
		
	}
	
	
	@Override
	public void render( float delta )
	{
		System.out.println("asdasdasd");
	}

	@Override
	public void resize(int width, int height) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void hide() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void resume() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dispose() {
	}

	

}
