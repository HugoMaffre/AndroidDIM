package hugo.maffre.mytodolistproject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by hmaffre on 01/03/2017.
 */
public class TodoActivity extends Activity implements View.OnClickListener {


        private TextView textView;
        private Button addBtn;
        private Button emptyBtn;
        private ListView listView;




        @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.task_layout);

            //récupération des éléments du layout
            addBtn = (Button) findViewById(R.id.addBtn);
            emptyBtn = (Button) findViewById(R.id.emptyBtn);
            textView = (TextView) findViewById(R.id.textView);
            listView = (ListView) findViewById(R.id.listView);
            //remplissage de la liste
            listView.setAdapter(new ArrayAdapter(getApplicationContext() , android.R.layout.simple_list_item_1, StockageValeurs.getInstance().values));

            addBtn.setOnClickListener(this);
            emptyBtn.setOnClickListener(this);
        }
        @Override
        public void onClick(View v) {
            switch(v.getId()){
                case R.id.addBtn:
                    Intent myIntent = new Intent(getApplicationContext(),AddValueActivity.class);
                    startActivity(myIntent);

                    break;
                case R.id.emptyBtn:
                    StockageValeurs.getInstance().values.clear();
                    break;
            }
            listView.invalidateViews();
        }

}