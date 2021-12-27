package space.abdilazov.threedrv;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<ModelContact> list = new ArrayList<ModelContact>();
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initData();
        recyclerView.findViewById(R.id.recyclerView);
        Adapter adapter = new Adapter(this,list);
        recyclerView.setAdapter(adapter);

    }

    private void initData() {
        list.add(new ModelContact("adadad",900909090,R.drawable.person_24));
        list.add(new ModelContact("adadad",900909090,R.drawable.person_24));
        list.add(new ModelContact("adadad",900909090,R.drawable.person_24));
        list.add(new ModelContact("adadad",900909090,R.drawable.person_24));
        list.add(new ModelContact("adadad",900909090,R.drawable.person_24));
        list.add(new ModelContact("adadad",900909090,R.drawable.person_24));
        list.add(new ModelContact("adadad",900909090,R.drawable.person_24));
        list.add(new ModelContact("adadad",900909090,R.drawable.person_24));
        list.add(new ModelContact("adadad",900909090,R.drawable.person_24));
        list.add(new ModelContact("adadad",900909090,R.drawable.person_24));
        list.add(new ModelContact("adadad",900909090,R.drawable.person_24));
        list.add(new ModelContact("adadad",900909090,R.drawable.person_24));
        list.add(new ModelContact("adadad",900909090,R.drawable.person_24));
    }
}