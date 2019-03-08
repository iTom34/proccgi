SRC_URI="git://github.com/varjagg/proccgi-am.git"
SRCREV = "${AUTOREV}"

LICENSE="GPLv2"

S="${WORKDIR}/proccgi"

inherit autotools pkgconfig
