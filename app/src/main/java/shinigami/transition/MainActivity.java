package shinigami.transition;

import android.graphics.drawable.TransitionDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.transition.Transition;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ImageView image = new ImageView(this);
        setContentView(image);
        TransitionDrawable transition = (TransitionDrawable) getResources().getDrawable(R.drawable.transicion);
        image.setImageDrawable(transition);
        transition.startTransition(2000);

    }
}
