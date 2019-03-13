let channelThumbnail: Resource = {
    guard let logo = StreamingRepo.channelLogo(forChannelId: item.project.channel?.id ?? 0) else { return LocalImage.empty }
    return logo
}()
