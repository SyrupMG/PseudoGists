//   static let formatter : DateFormatter = {
//      let fmt = DateFormatter()
//      fmt.timeStyle = .short
//      return fmt
//   }()
timeLabel.text = NowAirCell.formatter.string(from: item.beginDate)
