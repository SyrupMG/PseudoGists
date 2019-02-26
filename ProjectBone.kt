val grid = widgets ?: WidgetFactory.transform(ScreenGridRequest().read("projects/${bone.dataSource.item.projectId}"), bone).also {
                            widgets = it
                            cachedSeasons = if (widgets?.get(1) is GroupScreenWidget) (widgets?.get(1) as GroupScreenWidget<GroupScreenWidgetModel>?)?.getSeasons() else null
                        }
