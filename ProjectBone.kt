val grid = widgets ?: WidgetFactory.transform(ScreenGridRequest().read("projects/${bone.dataSource.item.projectId}"), bone).also {
                            widgets = it
                            cachedSeasons = (it[1] as? DefaultGroupScreenWidget)?.getSeasons()
                        }
