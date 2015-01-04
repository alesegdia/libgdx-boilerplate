package com.ufofrog.core;
import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.input.GestureDetector;
import com.badlogic.gdx.input.GestureDetector.GestureListener;
import com.ufofrog.core.ActionResolver;
import com.ufofrog.core.GameScreen;
/**
 * @author Alejandro Segu� D�az
 */

public abstract class GameApp extends Game implements ApplicationListener, GestureListener {
	
	protected ActionResolver actionResolver;
	
	public boolean debugrender = false;

	public GameApp(ActionResolver actionResolver)
	{
		this.actionResolver = actionResolver;
	}

	@Override
	public void create() {

		GestureDetector gd = new GestureDetector(this);
		Gdx.input.setInputProcessor(gd);

		Create();
		
	}
	
	protected void Create() {
		
	}

	public void ScreenChange( GameScreen<?> to )
	{
		
	}
	
	public void setScreen( GameScreen<?> gs )
	{
		System.out.println("exec!");
		ScreenChange(gs);
		setScreen( ((Screen)gs) );
		gs.Reset();
	}
}
