package cat.xtec.ioc.android;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.badlogic.gdx.backends.android.AndroidApplication;
import com.badlogic.gdx.backends.android.AndroidApplicationConfiguration;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.ui.ImageButton;
import com.badlogic.gdx.scenes.scene2d.utils.Drawable;
import com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable;

import cat.xtec.ioc.SpaceRace;
import cat.xtec.ioc.helpers.AssetManager;

public class AndroidLauncher extends AndroidApplication {

	@Override
	protected void onCreate (Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		AndroidApplicationConfiguration config = new AndroidApplicationConfiguration();
		// Deshabilitem els sensors que no anem a fer servir
		config.useAccelerometer = false;
		config.useCompass = false;
		// Impedim que s'apagui la pantalla
		config.useWakelock = true;
		// Posem el mode immersive per ocultar botons software
		config.useImmersiveMode = true;

		// Apliquem la configuració
		initialize(new SpaceRace(), config);



	}





}
