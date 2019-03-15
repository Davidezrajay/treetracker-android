package org.greenstand.android.TreeTracker.database.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey

@Entity(
    tableName = TreeEntity.TABLE,
    foreignKeys = [
        ForeignKey(entity = SettingsEntity::class,
                   parentColumns = [SettingsEntity.ID],
                   childColumns = [TreeEntity.SETTINGS_OVERRIDE_ID],
                   onUpdate = ForeignKey.CASCADE),
//        ForeignKey(entity = SettingsEntity::class,
//                   parentColumns = [SettingsEntity.ID],
//                   childColumns = [TreeEntity.SETTINGS_ID],
//                   onUpdate = ForeignKey.CASCADE),
        ForeignKey(entity = LocationEntity::class,
                   parentColumns = [LocationEntity.ID],
                   childColumns = [TreeEntity.LOCATION_ID],
                   onUpdate = ForeignKey.CASCADE),
        ForeignKey(entity = NoteEntity::class,
                   parentColumns = [NoteEntity.ID],
                   childColumns = [TreeEntity.CAUSE_OF_DEATH_ID],
                   onUpdate = ForeignKey.CASCADE),
        ForeignKey(entity = PlantIndentifications::class,
                   parentColumns = [PlantIndentifications.ID],
                   childColumns = [TreeEntity.PLANTER_IDENTIFICATION_ID],
                   onUpdate = ForeignKey.CASCADE)
    ]
)
data class TreeEntity(@PrimaryKey
                      @ColumnInfo(name = ID)
                      var id: Long,
                      @ColumnInfo(name = LOCATION_ID)
                      var locationId: Long?,
                      @ColumnInfo(name = PLANTER_IDENTIFICATION_ID)
                      var planterId: Long?,
                      @ColumnInfo(name = TIME_CREATED)
                      var timeCreated: Long?,
                      @ColumnInfo(name = TIME_UPDATED)
                      var timeUpdated: Long?,
                      @ColumnInfo(name = TIME_FOR_UPDATE)
                      var timeForUpdate: Long?,
                      @ColumnInfo(name = IS_SYNCED)
                      var isSynced: Boolean?,
                      @ColumnInfo(name = IS_PRIORITY)
                      var isPriority: Boolean?,
                      @ColumnInfo(name = CAUSE_OF_DEATH_ID)
                      var causeOfDeath: Int?,
                      @ColumnInfo(name = MAIN_DB_ID)
                      var mainDbId: Long?,
                      @ColumnInfo(name = SETTINGS_ID)
                      var settingId: Long?,
                      @ColumnInfo(name = USER_ID)
                      var userId: Long?,
                      @ColumnInfo(name = IS_MISSING)
                      var isMissing: Boolean?,
                      @ColumnInfo(name = SETTINGS_OVERRIDE_ID)
                      var settingsOverrideId: Long?,
                      @ColumnInfo(name = THREE_DIGIT_NUMBER)
                      var threeDigitNumber: Long?) {

    companion object {
        const val TABLE = "tree"
        const val ID = "_id"
        const val LOCATION_ID = "location_id"
        const val PLANTER_IDENTIFICATION_ID = "planter_identification_id"
        const val TIME_CREATED = "time_created"
        const val TIME_UPDATED = "time_updated"
        const val TIME_FOR_UPDATE = "time_for_update"
        const val IS_SYNCED = "is_synced"
        const val IS_PRIORITY = "is_priority"
        const val CAUSE_OF_DEATH_ID = "cause_of_death_id"
        const val MAIN_DB_ID = "main_db_id"
        const val SETTINGS_ID = "settings_id"
        const val USER_ID = "user_id"
        const val IS_MISSING = "is_missing"
        const val SETTINGS_OVERRIDE_ID = "settings_override_id"
        const val THREE_DIGIT_NUMBER = "three_digit_number"
    }
}