package hugo.maffre.mytodolistproject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

/**
 * Created by hmaffre on 01/03/2017.
 */
public class AddValueActivity extends Activity implements View.OnClickListener {


    private EditText editText;
    private Button ajoutBtn;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_value_layout);

        //récupération des éléments du layout
        ajoutBtn = (Button) findViewById(R.id.ajoutBtn);
        editText = (EditText) findViewById(R.id.editText);


        ajoutBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        StockageValeurs.getInstance().values.add(editText.getText().toString());
        Intent myIntent = new Intent(getApplicationContext(),TodoActivity.class);
        startActivity(myIntent);
    }

}
