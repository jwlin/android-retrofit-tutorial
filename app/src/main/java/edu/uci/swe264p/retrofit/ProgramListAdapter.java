package edu.uci.swe264p.retrofit;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;


public class ProgramListAdapter extends RecyclerView.Adapter<ProgramListAdapter.ViewHolder> {
    private List<String> mData;

    ProgramListAdapter(List<String> data) {
        this.mData = data;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView tv;

        ViewHolder(View itemView) {
            super(itemView);
            tv = itemView.findViewById(R.id.tvProgramName);
        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.program_row, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        String program = mData.get(position);
        holder.tv.setText(program);
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }
}
