package mustafaozhan.github.com.mycurrencies.room.model

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

/**
 * Created by Mustafa Ozhan on 2018-07-16.
 */
@Entity(tableName = "currency")
data class Currency(
        @PrimaryKey @ColumnInfo(name = "name") var name: String,
        @ColumnInfo(name = "rate") var rate: Double = 0.0,
        @ColumnInfo(name = "isActive") var isActive: Int = 1)