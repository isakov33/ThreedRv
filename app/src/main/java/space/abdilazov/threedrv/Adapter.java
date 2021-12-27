package space.abdilazov.threedrv;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    List<ModelContact> list;

    public Adapter(MainActivity mainActivity, List<ModelContact> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_rv,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        ModelContact modelContact = list.get(position);
        holder.imageView.setImageResource(modelContact.getImageView());
        holder.textView1.setText(modelContact.getTitle());
        holder.textView2.setText(modelContact.getNumber());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

         ImageView imageView;
         TextView textView1, textView2;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
        imageView = itemView.findViewById(R.id.image);
        textView1 = itemView.findViewById(R.id.title);
        textView2 = itemView.findViewById(R.id.number);
        }
    }
}
