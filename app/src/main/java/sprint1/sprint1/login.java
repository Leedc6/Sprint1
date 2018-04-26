package sprint1.sprint1;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.EditText;

/**
 * Created by davidlee on 4/25/2018.
 */

public class login extends Activity{

    public void clickLogin(View v) {
        if(v.getId() == R.id.login) {
            EditText a = (EditText)findViewById(R.id.Username);
            String str = a.getText().toString();

            Intent i = new Intent(login.this, MainActivity.class);
            i.putExtra("Username",str);
            startActivity(i);
        }
    }

    private static String username;
    private static String password;
}
