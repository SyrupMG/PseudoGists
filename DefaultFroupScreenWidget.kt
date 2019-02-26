//After
fun DefaultGroupScreenWidget.getSeasons(): SeasonsData? {

    val curGroup = getData().firstOrNull() ?: return null

    return SeasonsData(subWidgets.mapNotNull { it as? ProjectTracksWidget },
        GroupScreenWidgetModel(curGroup.title,  curGroup.subtitles.filter { it -> it.group == "Seasons" }.toTypedArray()))
}
