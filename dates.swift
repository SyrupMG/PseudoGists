timeLabel.text = {
    let hour = Calendar.current.component(.hour, from: item.beginDate)
    let minutes = Calendar.current.component(.minute, from: item.beginDate)
    return "\(String(format: "%02d", hour)):\(String(format: "%02d", minutes))"
}()
